load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "core",
    srcs = glob(["src/main/**/*.java"]),
    main_class = "core.App",
    deps = [
        #        "@maven//:junit_junit",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_slf4j_slf4j_simple",
    ],
)

# Tests
#java_library(
#    name = "core_test_files",
#    testonly = 1,
#    srcs = glob(["src/test/**/*.java"]),
#    deps = [
#        "@maven//:junit_junit",
#    ],
#)
#
#java_test(
#    name = "tcore",
#    size = "small",
#    test_class = "core.AppTest",
#    runtime_deps = [
#        ":core_test_files",
#    ],
#)
