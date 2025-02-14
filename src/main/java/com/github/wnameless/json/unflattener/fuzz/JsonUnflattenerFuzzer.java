/*
 *
 * Copyright 2015 Wei-Ming Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package com.github.wnameless.json.unflattener.fuzz;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.StringReader;
// import java.net.URL;
// import java.util.Collections;
// import java.util.List;
// import java.util.Map;

// import com.fasterxml.jackson.databind.DeserializationFeature;
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.github.wnameless.json.base.JacksonJsonCore;
// import com.github.wnameless.json.base.JacksonJsonValue;
import com.github.wnameless.json.unflattener.JsonUnflattener;
// import com.google.common.base.Charsets;
// import com.google.common.collect.ImmutableMap;
// import com.google.common.io.Resources;

public class JsonUnflattenerFuzzer {

	public static void fuzzerTestOneInput(FuzzedDataProvider data) {
		try {
  		String input = data.consumeRemainingAsString();
  		JsonUnflattener.unflatten(input);

		} catch (IOException ignored) {}
	}
}
