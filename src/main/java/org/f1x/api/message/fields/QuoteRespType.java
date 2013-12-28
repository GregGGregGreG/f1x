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
public enum QuoteRespType implements org.f1x.api.message.types.ByteEnum {
	HIT_LIFT((byte)'1'),
	COUNTER((byte)'2'),
	EXPIRED((byte)'3'),
	COVER((byte)'4'),
	DONE_AWAY((byte)'5'),
	PASS((byte)'6');

	private final byte code;

	QuoteRespType (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static QuoteRespType parse(String s) {
		switch(s) {
			case "1" : return HIT_LIFT;
			case "2" : return COUNTER;
			case "3" : return EXPIRED;
			case "4" : return COVER;
			case "5" : return DONE_AWAY;
			case "6" : return PASS;
		}
		return null;
	}

}