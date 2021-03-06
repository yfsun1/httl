/*
 * Copyright 2011-2013 HTTL Team.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package httl.ast;

import httl.spi.Translator;

import java.util.Collection;
import java.util.Map;

/**
 * Operator. (SPI, Prototype, ThreadSafe)
 * 
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public abstract class Operator extends Parameter {

	private final String name;
	
	private final int priority;

	private final Collection<Class<?>> functions;
	
	private final String[] packages;

	public Operator(Translator translator, String source, int offset, Map<String, Class<?>> parameterTypes, Collection<Class<?>> functions, String[] packages, String name, int priority){
		super(parameterTypes, offset);
		this.name = name;
		this.priority = priority;
		this.functions = functions;
		this.packages = packages;
	}

	public Collection<Class<?>> getFunctions() {
		return functions;
	}

	public String[] getPackages() {
		return packages;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
