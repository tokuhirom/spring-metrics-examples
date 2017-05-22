# sample project for spring-metrics

(Note: spring-metrics is under construction. This project is a sample code for alpha state of spring-metrics)


http://localhost:8081/application/prometheus

## Sample output

```
# HELP threads_live  
# TYPE threads_live gauge
threads_live 39.0
# HELP http_client_requests  
# TYPE http_client_requests summary
http_client_requests_count{clientName="example.com",method="GET",status="200",uri="none",} 1.0
http_client_requests_sum{clientName="example.com",method="GET",status="200",uri="none",} 0.284614485
# HELP http_server_requests  
# TYPE http_server_requests summary
http_server_requests_count{method="GET",status="200",uri="example",} 1.0
http_server_requests_sum{method="GET",status="200",uri="example",} 0.377031681
http_server_requests_count{method="GET",status="200",uri="hello",} 1.0
http_server_requests_sum{method="GET",status="200",uri="hello",} 0.00899753
# HELP classes_loaded  
# TYPE classes_loaded gauge
classes_loaded 7425.0
# HELP jvm_gc_pause  
# TYPE jvm_gc_pause summary
jvm_gc_pause_count{action="end of major GC",cause="Metadata GC Threshold",} 1.0
jvm_gc_pause_sum{action="end of major GC",cause="Metadata GC Threshold",} 0.111
jvm_gc_pause_count{action="end of minor GC",cause="Metadata GC Threshold",} 1.0
jvm_gc_pause_sum{action="end of minor GC",cause="Metadata GC Threshold",} 0.04
jvm_gc_pause_count{action="end of minor GC",cause="Allocation Failure",} 1.0
jvm_gc_pause_sum{action="end of minor GC",cause="Allocation Failure",} 0.044
# HELP jvm_gc_max_data_size  
# TYPE jvm_gc_max_data_size gauge
jvm_gc_max_data_size 1.431830528E9
# HELP logback_events  
# TYPE logback_events counter
logback_events{level="warn",} 149.0
logback_events{level="debug",} 4382.0
logback_events{level="error",} 0.0
logback_events{level="trace",} 4612.0
logback_events{level="info",} 118.0
# HELP jvm_gc_promotion_rate  
# TYPE jvm_gc_promotion_rate counter
jvm_gc_promotion_rate 1.0927424E7
# HELP jvm_gc_allocation_rate  
# TYPE jvm_gc_allocation_rate counter
jvm_gc_allocation_rate 3.27254704E8
# HELP cpu_total  
# TYPE cpu_total gauge
cpu_total 4.0
# HELP threads_daemon  
# TYPE threads_daemon gauge
threads_daemon 36.0
# HELP threads_peak  
# TYPE threads_peak gauge
threads_peak 43.0
# HELP jvm_gc_live_data_size  
# TYPE jvm_gc_live_data_size gauge
jvm_gc_live_data_size 2.92124E7
# HELP classes_unloaded  
# TYPE classes_unloaded gauge
classes_unloaded 0.0
# HELP cpu_load_average  
# TYPE cpu_load_average gauge
cpu_load_average 3.1708984375
```
