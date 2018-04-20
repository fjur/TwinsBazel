# File //:WORKSPACE
workspace(name = "com_filip_payment")

git_repository(
    name = "org_pubref_rules_protobuf",
    tag = "v0.8.2",
    remote = "https://github.com/pubref/rules_protobuf.git",
)

# Load language-specific dependencies
load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_repositories")
java_proto_repositories()

# proto_library, cc_proto_library, and java_proto_library rules implicitly
# depend on @com_google_protobuf for protoc and proto runtimes.
# This statement defines the @com_google_protobuf repo.
#http_archive(
#    name = "com_google_protobuf",
#    sha256 = "cef7f1b5a7c5fba672bec2a319246e8feba471f04dcebfe362d55930ee7c1c30",
#    strip_prefix = "protobuf-3.5.0",
#    urls = ["https://github.com/google/protobuf/archive/v3.5.0.zip"],
#)

# java_lite_proto_library rules implicitly depend on @com_google_protobuf_javalite//:javalite_toolchain,
# which is the JavaLite proto runtime (base classes and common utilities).
#http_archive(
#    name = "com_google_protobuf_javalite",
#    sha256 = "d8a2fed3708781196f92e1e7e7e713cf66804bd2944894401057214aff4f468e",
#    strip_prefix = "protobuf-5e8916e881c573c5d83980197a6f783c132d4276",
#    urls = ["https://github.com/google/protobuf/archive/5e8916e881c573c5d83980197a6f783c132d4276.zip"],
#)


