
/*
 * Copyright (C) 2016 Ordnance Survey
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

package uk.os.unplugged.updater.android;

import java.io.File;

/**
 * Note: all references are assumed to have corresponding MD5 files.  For example, foo.bar is
 * expected to have a corresponding foo.bar.md5 file.
 */
public interface DataSource {

    /**
     * @return a reference to an updated gazetteer file
     */
    File getGazetteerData();

    /**
     * @return a reference to an updated map file
     */
    File getMapData();
}
