#java_library(
#    name = "payment",
#    srcs = glob(["src/main/java/**/*.java"])
#)

java_binary(
    name = "payment",
    main_class = "com.filip.payment.PaymentServer",
    srcs = [
        "src/main/java/com/filip/payment/PaymentServer.java"
    ],
    deps = [
        "@org_pubref_rules_protobuf//java:grpc_compiletime_deps",
    ],
    runtime_deps = [
        "@org_pubref_rules_protobuf//java:netty_runtime_deps",
    ]
)