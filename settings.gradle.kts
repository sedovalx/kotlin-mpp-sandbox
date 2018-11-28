rootProject.name = "kotlin-mpp-sandbox"

enableFeaturePreview("GRADLE_METADATA")

include(
    ":subprojects:model",
    ":subprojects:model-serialization",
    ":subprojects:client"
)