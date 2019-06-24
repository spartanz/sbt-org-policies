enablePlugins(OrgPoliciesPlugin)

name := "simple"

TaskKey[Unit]("check-organization") := {
  assert(organization.value == "org.spartanz", s"Common setting not applied (organization = ${organization.value})")
}
