/**
 * Created by dneufeld on 6/9/17.
 */
import edu.colorado.cires.cedar.*

def app = new App()

println app.description()
def map = app.loadData()

map.each { k, v ->
    if (v) {
        println "key=${k}"
        println "value=${v}"
    }
}
