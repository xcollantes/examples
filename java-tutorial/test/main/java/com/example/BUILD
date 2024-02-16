# filegroup(
#     name = "third_party",
#     srcs = ["//../:third_party"],
# )

java_test(
    name = "greeting",
    test_class = "com.example.GreetingTest",
    srcs = glob(["*Test.java"]),
    deps = [
        "@maven//:junit_junit",
    ],
    jvm_flags = ["-Dtest.logging=INFO"],
    size = "small",
)