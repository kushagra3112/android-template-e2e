rootProject.name = "Android Template"

include(":app")
include(":data:service")
include(":data:service-impl")
include(":data:service-di")
include(":data:service-entity")
include(":data:repo")
include(":data:repo-impl")
include(":data:repo-di")
include(":data:domain")
include(":data:domain-impl")
include(":data:domain-di")
include(":data:domain-entity")
include(":ui:interactor")
include(":ui:interactor-di")
include(":ui:interactor-impl")
//include(":presentation")
//include(":presentation-di")
include(":ui:presentation-entity")
include(":navigation")
include(":navigation-di")
include(":navigation-impl")
include(":resources")
include(":ui:feature:home")
include(":data:core")
include(":ui:core")
include(":ui:core-ui")
include(":ui:design-system")
include(":ui:feature:search")

for (project in rootProject.children) {
    project.buildFileName = "${project.name}.gradle.kts"
    for (subProject in project.children) {
        subProject.buildFileName = "${project.name}.${subProject.name}.gradle.kts"
        for (subProject2 in subProject.children) {
            subProject2.buildFileName = "${project.name}.${subProject.name}.${subProject2.name}.gradle.kts"
        }
    }
}

