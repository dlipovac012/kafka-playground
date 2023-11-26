load("@rules_java//java:defs.bzl", "java_binary")
load("//bazel:junit5.bzl", "java_junit5_test")

java_library(
    name = "api_lib",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = [
        "//api/src/main/resources:application",
    ],
    visibility = ["//visibility:private"],
    deps = [
        "@maven//:com_google_code_gson_gson",
        "@maven//:com_zaxxer_HikariCP",
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
        "@maven//:org_springframework_boot_spring_boot_starter",
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        "@maven//:org_springframework_spring_beans",
        "@maven//:org_springframework_spring_context",
        "@maven//:org_springframework_spring_web",
#        "@maven//:org_apache_httpcomponents_core5_httpcore5",
#        "@maven//:org_apache_httpcomponents_client5_httpclient5",
    ],
)

java_binary(
    name = "run_local",
    main_class = "dev.dalibor.kafka_playground.Api",
    runtime_deps = [
        ":api_lib",
    ],
)

java_junit5_test(
    name = "api_tests",
    srcs = glob(["src/test/java/**/*.java"]),
    test_package = "dev.dalibor.kafka_playground",
    deps = [
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_hamcrest_hamcrest",
        "@maven//:org_apache_httpcomponents_client5_httpclient5",
        "@maven//:org_apache_httpcomponents_core5_httpcore5",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_fasterxml_jackson_core_jackson_core",
    ],
)

java_junit5_test(
    name = "entities_tests",
    srcs = glob(["src/test/java/**/*.java"]),
    test_package = "entities",
    deps = [
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_hamcrest_hamcrest",
        "@maven//:org_apache_httpcomponents_client5_httpclient5",
        "@maven//:org_apache_httpcomponents_core5_httpcore5",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_fasterxml_jackson_core_jackson_core",
    ],
)
