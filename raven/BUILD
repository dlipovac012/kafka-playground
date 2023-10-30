load("@rules_java//java:defs.bzl", "java_binary")

java_library(
    name = "raven_lib",
    srcs = glob(["src/main/**/*.java"]),
    resources = [
        "//raven/src/main/resources:application",
    ],
    deps = [
        "@maven//:com_zaxxer_HikariCP",
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
        "@maven//:org_springframework_boot_spring_boot_starter",
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        "@maven//:org_springframework_boot_spring_boot_test",
        "@maven//:org_springframework_boot_spring_boot_test_autoconfigure",
        "@maven//:org_springframework_spring_beans",
        "@maven//:org_springframework_spring_context",
        "@maven//:org_springframework_spring_test",
        "@maven//:org_springframework_spring_web",
    ],
    visibility = ["//visibility:private"]
)

java_library(
    name = "raven_test_lib",
    srcs = glob(["src/test/**/*.java"]),
    deps = [
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_slf4j_slf4j_simple",
    ],
    testonly = True,
    visibility = ["//visibility:private"],
)

java_binary(
    name = "run_local",
    main_class = "api.Api",
    runtime_deps = [
        ":raven_lib",
    ],
)

#java_test(
#    name = "test",
#    size = "small",
#    runtime_deps = [
#        "//:raven_test_lib"
#    ]
#)