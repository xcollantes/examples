load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "ProjectRunner",
    main_class = "com.example.ProjectRunner",
    srcs = [
        "src/main/java/com/example/ProjectRunner.java",
    ],
    deps = [
        ":greeter",
        "@fancytext//fancy-text-main/src/java/com/engflow/fancytext:fancytext"
    ],
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
    deps = [
        "@fancytext//fancy-text-main/src/java/com/engflow/fancytext:fancytext",
    ],
)