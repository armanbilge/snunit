package snunit

private[snunit] object EventPollingExecutorScheduler {
  def monitorReads(
      fd: Int,
      cb: Runnable
  ): Runnable = {
    epollcat.snunit.InternalEventPollingExecutorSchedulerImpl.monitorReads(fd, cb)
  }

  def execute(runnable: Runnable): Unit = {
    epollcat.unsafe.EpollRuntime.global.compute.execute(runnable)
  }
}
