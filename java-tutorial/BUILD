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
    ],
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
    deps = [
        "@fancytext//fancy-text-main/src/java/com/engflow/fancytext:fancytext",
    ],
)

java_test(
    name = "greeter_test",
    test_class = "com.example.GreetingTest",
    srcs = glob(["test/main/java/com/example/*Test.java"]),
    deps = [
        "@maven//:junit_junit",
        ":greeter",
    ],
    size = "small",
)