load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_library")

java_proto_library(
  name = "payment_proto",
  protos = [
    "payment.proto"
  ],
  with_grpc = True,
  verbose = 1, # 0=no output, 1=show protoc command, 2+ more...
)

#proto_library(
#    name = "payment_proto",
#    srcs = ["payment.proto"]
#)

#java_proto_library(
#    name = "payment_java_proto",
#    deps = [":payment_proto"],
#    with_grpc = True,
#    verbose = 1, # 0=no output, 1=show protoc command, 2+ more...
#)
