load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_jvm_external//:defs.bzl", "artifact")
load("@contrib_rules_jvm//java:defs.bzl", "JUNIT5_DEPS", "java_test_suite")

java_library(
    name = "raven_lib",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = [
        "//raven/src/main/resources:application",
    ],
    visibility = ["//visibility:private"],
    deps = [
        "@maven//:com_zaxxer_HikariCP",
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
        "@maven//:org_springframework_boot_spring_boot_starter",
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        "@maven//:org_springframework_spring_beans",
        "@maven//:org_springframework_spring_context",
        "@maven//:org_springframework_spring_web",
    ],
)

java_binary(
    name = "run_local",
    main_class = "api.Api",
    runtime_deps = [
        ":raven_lib",
    ],
)


java_test_suite(
    name = "unit_test",
    srcs = glob(["src/test/java/**/*.java"]),
    runner = "junit5",
    test_suffixes = ["Test.java"],
    runtime_deps = JUNIT5_DEPS,
    deps = [
        ":raven_lib",
        "@maven//:org_hamcrest_hamcrest",
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_junit_jupiter_junit_jupiter_api",
        "@maven//:org_junit_jupiter_junit_jupiter_params",
        "@maven//:org_junit_jupiter_junit_jupiter_engine",
        "@maven//:org_junit_vintage_junit_vintage_engine",
        "@maven//:org_junit_platform_junit_platform_launcher",
        "@maven//:org_springframework_spring_test",
        "@maven//:org_springframework_boot_spring_boot_test",
        "@maven//:org_springframework_boot_spring_boot_test_autoconfigure",
    ],
)