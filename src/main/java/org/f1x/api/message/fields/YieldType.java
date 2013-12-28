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
public enum YieldType implements org.f1x.api.message.types.StringEnum {
	AFTER_TAX_YIELD("AFTERTAX"),
	ANNUAL_YIELD("ANNUAL"),
	YIELD_AT_ISSUE("ATISSUE"),
	YIELD_TO_AVERAGE_MATURITY("AVGMATURITY"),
	BOOK_YIELD("BOOK"),
	YIELD_TO_NEXT_CALL("CALL"),
	YIELD_CHANGE_SINCE_CLOSE("CHANGE"),
	CLOSING_YIELD("CLOSE"),
	COMPOUND_YIELD("COMPOUND"),
	CURRENT_YIELD("CURRENT"),
	TRUE_GROSS_YIELD("GROSS"),
	GOVERNMENT_EQUIVALENT_YIELD("GOVTEQUIV"),
	YIELD_WITH_INFLATION_ASSUMPTION("INFLATION"),
	INVERSE_FLOATER_BOND_YIELD("INVERSEFLOATER"),
	MOST_RECENT_CLOSING_YIELD("LASTCLOSE"),
	CLOSING_YIELD_MOST_RECENT_MONTH("LASTMONTH"),
	CLOSING_YIELD_MOST_RECENT_QUARTER("LASTQUARTER"),
	CLOSING_YIELD_MOST_RECENT_YEAR("LASTYEAR"),
	YIELD_TO_LONGEST_AVERAGE_LIFE("LONGAVGLIFE"),
	MARK_TO_MARKET_YIELD("MARK"),
	YIELD_TO_MATURITY("MATURITY"),
	YIELD_TO_NEXT_REFUND("NEXTREFUND"),
	OPEN_AVERAGE_YIELD("OPENAVG"),
	YIELD_TO_NEXT_PUT("PUT"),
	PREVIOUS_CLOSE_YIELD("PREVCLOSE"),
	PROCEEDS_YIELD("PROCEEDS"),
	SEMI_ANNUAL_YIELD("SEMIANNUAL"),
	YIELD_TO_SHORTEST_AVERAGE_LIFE("SHORTAVGLIFE"),
	SIMPLE_YIELD("SIMPLE"),
	TAX_EQUIVALENT_YIELD("TAXEQUIV"),
	YIELD_TO_TENDER_DATE("TENDER"),
	TRUE_YIELD("TRUE"),
	YIELD_VALUE_OF_1_32("VALUE1_32"),
	YIELD_TO_WORST("WORST");

	private final String code;

	YieldType (String code) {
		this.code  = code;
		bytes = code.getBytes();
	}

	public String getCode() { return code; }

	private final byte[] bytes;
	public byte[] getBytes() { return bytes; }


	public static YieldType parse(String s) {
		switch(s) {
			case "AFTERTAX" : return AFTER_TAX_YIELD;
			case "ANNUAL" : return ANNUAL_YIELD;
			case "ATISSUE" : return YIELD_AT_ISSUE;
			case "AVGMATURITY" : return YIELD_TO_AVERAGE_MATURITY;
			case "BOOK" : return BOOK_YIELD;
			case "CALL" : return YIELD_TO_NEXT_CALL;
			case "CHANGE" : return YIELD_CHANGE_SINCE_CLOSE;
			case "CLOSE" : return CLOSING_YIELD;
			case "COMPOUND" : return COMPOUND_YIELD;
			case "CURRENT" : return CURRENT_YIELD;
			case "GROSS" : return TRUE_GROSS_YIELD;
			case "GOVTEQUIV" : return GOVERNMENT_EQUIVALENT_YIELD;
			case "INFLATION" : return YIELD_WITH_INFLATION_ASSUMPTION;
			case "INVERSEFLOATER" : return INVERSE_FLOATER_BOND_YIELD;
			case "LASTCLOSE" : return MOST_RECENT_CLOSING_YIELD;
			case "LASTMONTH" : return CLOSING_YIELD_MOST_RECENT_MONTH;
			case "LASTQUARTER" : return CLOSING_YIELD_MOST_RECENT_QUARTER;
			case "LASTYEAR" : return CLOSING_YIELD_MOST_RECENT_YEAR;
			case "LONGAVGLIFE" : return YIELD_TO_LONGEST_AVERAGE_LIFE;
			case "MARK" : return MARK_TO_MARKET_YIELD;
			case "MATURITY" : return YIELD_TO_MATURITY;
			case "NEXTREFUND" : return YIELD_TO_NEXT_REFUND;
			case "OPENAVG" : return OPEN_AVERAGE_YIELD;
			case "PUT" : return YIELD_TO_NEXT_PUT;
			case "PREVCLOSE" : return PREVIOUS_CLOSE_YIELD;
			case "PROCEEDS" : return PROCEEDS_YIELD;
			case "SEMIANNUAL" : return SEMI_ANNUAL_YIELD;
			case "SHORTAVGLIFE" : return YIELD_TO_SHORTEST_AVERAGE_LIFE;
			case "SIMPLE" : return SIMPLE_YIELD;
			case "TAXEQUIV" : return TAX_EQUIVALENT_YIELD;
			case "TENDER" : return YIELD_TO_TENDER_DATE;
			case "TRUE" : return TRUE_YIELD;
			case "VALUE1_32" : return YIELD_VALUE_OF_1_32;
			case "WORST" : return YIELD_TO_WORST;
		}
		return null;
	}

}