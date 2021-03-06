/*
 * � Copyright IBM Corp. 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package com.ibm.domino.calendar.store;

public class DelegateAction extends Action {
	
	private String _delegateTo;
	private Boolean _keepInformed; // null means use user's default
	
	/**
     * @return the keepInformed
     */
    public Boolean getKeepInformed() {
        return _keepInformed;
    }

    public String getDelegateTo() {
		return _delegateTo;
	}

	public DelegateAction(String comments, String delegateTo, Boolean keepInformed) {
		super(Action.ACTION_DELEGATE, comments);
		_delegateTo = delegateTo;
		_keepInformed = keepInformed;
	}

}
