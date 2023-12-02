load("@rules_java//java:defs.bzl", "java_binary")
#load("@io_bazel_rules_docker//java:image.bzl", "java_image")


java_library(
    name = "api_lib",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = [
        "//api/src/main/resources:application",
    ],
    visibility = ["//visibility:private"],
    deps = [
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_slf4j_slf4j_simple",
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


#java_image(
#    name = "java_image",
#    srcs = ["Binary.java"],
#    # Put these runfiles into their own layer.
#    layers = [":java_image_library"],
#    main_class = "examples.images.Binary",
#)