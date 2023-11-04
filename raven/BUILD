load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_jvm_external//:defs.bzl", "artifact")
load("//bazel:junit5.bzl", "java_junit5_test")

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

java_junit5_test(
    name = "test",
    srcs = ["src/test/java/entities/CommonUserTest.java"],
    test_package = "entities",
    deps = [
        "@maven//:org_hamcrest_hamcrest",
        "@maven//:org_assertj_assertj_core",
    ],
)
