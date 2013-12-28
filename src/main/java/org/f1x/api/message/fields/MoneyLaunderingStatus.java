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
public enum MoneyLaunderingStatus implements org.f1x.api.message.types.ByteEnum {
	PASSED((byte)'Y'),
	NOT_CHECKED((byte)'N'),
	EXEMPT_BELOW_THE_LIMIT((byte)'1'),
	EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION((byte)'2'),
	EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION((byte)'3');

	private final byte code;

	MoneyLaunderingStatus (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static MoneyLaunderingStatus parse(String s) {
		switch(s) {
			case "Y" : return PASSED;
			case "N" : return NOT_CHECKED;
			case "1" : return EXEMPT_BELOW_THE_LIMIT;
			case "2" : return EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION;
			case "3" : return EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION;
		}
		return null;
	}

}