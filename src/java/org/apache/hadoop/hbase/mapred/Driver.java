/**
 * Copyright 2008 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.mapred;

import org.apache.hadoop.util.ProgramDriver;

/**
 * Driver for hbase mapreduce jobs. Select which to run by passing
 * name of job to this main.
 */
@Deprecated
public class Driver {
  /**
   * @param args
   * @throws Throwable 
   */
  public static void main(String[] args) throws Throwable {
    ProgramDriver pgd = new ProgramDriver();
    pgd.addClass(RowCounter.NAME, RowCounter.class,
      "Count rows in HBase table");
    pgd.driver(args);
  }
}
