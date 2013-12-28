/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum TaxAdvantageType implements org.f1x.api.message.types.IntEnum {
	NONE(0),
	MAXI_ISA(1),
	TESSA(2),
	MINI_CASH_ISA(3),
	MINI_STOCKS_AND_SHARES_ISA(4),
	MINI_INSURANCE_ISA(5),
	CURRENT_YEAR_PAYMENT(6),
	PRIOR_YEAR_PAYMENT(7),
	ASSET_TRANSFER(8),
	EMPLOYEE_PRIOR_YEAR(9),
	OTHER(999);

	private final int code;

	TaxAdvantageType (int code) {
		this.code  = code;
	}

	public int getCode() { return code; }

	public static TaxAdvantageType parse(String s) {
		switch(s) {
			case "0" : return NONE;
			case "1" : return MAXI_ISA;
			case "2" : return TESSA;
			case "3" : return MINI_CASH_ISA;
			case "4" : return MINI_STOCKS_AND_SHARES_ISA;
			case "5" : return MINI_INSURANCE_ISA;
			case "6" : return CURRENT_YEAR_PAYMENT;
			case "7" : return PRIOR_YEAR_PAYMENT;
			case "8" : return ASSET_TRANSFER;
			case "9" : return EMPLOYEE_PRIOR_YEAR;
			case "999" : return OTHER;
		}
		return null;
	}

}