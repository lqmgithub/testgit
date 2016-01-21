	/**
	 * 查询任务列表
	 * @return
	 * @throws Exception
	 */
	@GET
	@Produces({ "application/json" })
	public Response getTasks() throws Exception {
		Map<String, Object> params = getQueryParams();
		QueryResult<ScheduleTask> qr = scheduleTaskDao.queryTasklist(params);
		String jsonStr = responseListJson(qr);
        return Response.ok(jsonStr).build();
	}
	