/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package httl.spi.loaders;

import httl.Resource;
import httl.spi.Loader;

/**
 * AbstractResource. (SPI, Prototype, ThreadSafe)
 * 
 * @see httl.spi.loaders.AbstractLoader#load(String, String)
 * 
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public abstract class AbstractResource implements Resource {

    private static final long serialVersionUID = 6834431114838915042L;

    private final transient Loader loader;
    
    private final String name;
    
    private final String encoding;

    public AbstractResource(Loader loader, String name, String encoding) {
        this.loader = loader;
        this.name = name;
        this.encoding = encoding;
    }

    public Loader getLoader() {
        return loader;
    }

    public String getName() {
        return name;
    }

    public String getEncoding() {
        return encoding;
    }

    public long getLastModified() {
        return -1;
    }

    public long getLength() {
        return -1;
    }

}