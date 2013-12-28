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
public enum Adjustment implements org.f1x.api.message.types.ByteEnum {
	CANCEL((byte)'1'),
	ERROR((byte)'2'),
	CORRECTION((byte)'3');

	private final byte code;

	Adjustment (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static Adjustment parse(String s) {
		switch(s) {
			case "1" : return CANCEL;
			case "2" : return ERROR;
			case "3" : return CORRECTION;
		}
		return null;
	}

}