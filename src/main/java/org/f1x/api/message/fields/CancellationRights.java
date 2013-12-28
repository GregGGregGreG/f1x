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
public enum CancellationRights implements org.f1x.api.message.types.ByteEnum {
	YES((byte)'Y'),
	NO_EXECUTION_ONLY((byte)'N'),
	NO_WAIVER_AGREEMENT((byte)'M'),
	NO_INSTITUTIONAL((byte)'O');

	private final byte code;

	CancellationRights (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static CancellationRights parse(String s) {
		switch(s) {
			case "Y" : return YES;
			case "N" : return NO_EXECUTION_ONLY;
			case "M" : return NO_WAIVER_AGREEMENT;
			case "O" : return NO_INSTITUTIONAL;
		}
		return null;
	}

}