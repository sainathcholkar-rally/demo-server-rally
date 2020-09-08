package filters

import javax.inject.Inject
import play.mvc.EssentialFilter
import play.filters.cors.CORSFilter
import play.http.DefaultHttpFilters


class Filters @Inject()(var corsFilter: CORSFilter) extends DefaultHttpFilters (corsFilter) {
  def filters: Array[EssentialFilter] = {
    return Array[EssentialFilter] (corsFilter.asJava)
  }
}