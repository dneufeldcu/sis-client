package edu.colorado.cires.cedar

import org.opengis.metadata.Metadata

import org.apache.sis.storage.*
import org.apache.sis.metadata.*
import org.apache.sis.util.collection.TableColumn;
import org.apache.sis.util.collection.TreeTable;
import org.apache.sis.util.collection.TreeTableFormat;

/**
 * Created by dneufeld on 6/9/17.
 */
class App {
    public loadData() {
        def Locale locale
        def TimeZone timezone
        try {
            DataStore store = DataStores.open("https://github.com/opengeospatial/geoapi/raw/master/geoapi-netcdf/src/test/resources/org/opengis/wrapper/netcdf/NCEP-SST.nc")
            def metadata = store.metadata

            Map map = MetadataStandard.ISO_19115.asValueMap(metadata, KeyNamePolicy.JAVABEANS_PROPERTY, ValueExistencePolicy.ALL)


            return map
        } catch (Exception e) {
            println "${e}"
            return null
        }
    }

    public description() {
        "SIS Experimental Client"
    }
}
