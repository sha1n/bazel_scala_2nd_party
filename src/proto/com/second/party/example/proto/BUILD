load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scalapb_proto_library")

package(default_visibility = ["//visibility:public"])

proto_library(
    name = "proto",
    srcs = glob(["**/*.proto"]),
    visibility = ["//visibility:public"],
    deps = [
    ],
)

scalapb_proto_library(
    name = "proto_scala",
    visibility = ["//visibility:public"],
    deps = [":proto"],
)

