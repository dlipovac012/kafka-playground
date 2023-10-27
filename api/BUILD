load("@rules_java//java:defs.bzl", "java_binary")

java_library(
    name = "api_lib",
    srcs = glob(["src/main/**/*.java"]),
    deps = [
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
)

java_binary(
    name = "run_local",
    main_class = "api.Api",
    runtime_deps = [
        ":api_lib",
    ],
)
