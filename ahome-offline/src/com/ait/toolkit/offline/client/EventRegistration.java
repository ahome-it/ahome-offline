/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.offline.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Registration class for offline event handlers. This class is returned when
 * adding an event handler to the {@link Offline}.
 */
public class EventRegistration {

	private final String eventName;
	private final JavaScriptObject callback;

	public EventRegistration(String eventName, JavaScriptObject callback) {
		this.eventName = eventName;
		this.callback = callback;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @return the callback
	 */
	public JavaScriptObject getCallback() {
		return callback;
	}

	/**
	 * Unbind an event
	 */
	public native void unregister()/*-{
		var event = this.@com.ait.toolkit.offline.client.EventRegistration::getEventName()();
		var fn = this.@com.ait.toolkit.offline.client.EventRegistration::getCallback()();
		$wnd.Offline.off(event, fn);
	}-*/;

}
