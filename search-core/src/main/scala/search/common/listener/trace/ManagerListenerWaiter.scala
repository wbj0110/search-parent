package search.common.listener.trace

/**
 * Created by soledede on 2015/9/17.
 */
class ManagerListenerWaiter extends TraceListenerWaiter

object ManagerListenerWaiter {
  var w: ManagerListenerWaiter = null

  def apply(): ManagerListenerWaiter = {
    if (w == null) w = new ManagerListenerWaiter()
    w
  }
}

