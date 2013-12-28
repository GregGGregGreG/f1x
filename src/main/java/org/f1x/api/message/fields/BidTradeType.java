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
public enum BidTradeType implements org.f1x.api.message.types.ByteEnum {
	RISK_TRADE((byte)'R'),
	VWAP_GUARANTEE((byte)'G'),
	AGENCY((byte)'A'),
	GUARANTEED_CLOSE((byte)'J');

	private final byte code;

	BidTradeType (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static BidTradeType parse(String s) {
		switch(s) {
			case "R" : return RISK_TRADE;
			case "G" : return VWAP_GUARANTEE;
			case "A" : return AGENCY;
			case "J" : return GUARANTEED_CLOSE;
		}
		return null;
	}

}