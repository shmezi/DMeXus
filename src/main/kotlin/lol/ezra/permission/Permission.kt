package lol.ezra.permission

class Permission(
   val id: String,
   val parent: Permission?,
   vararg val children: Permission
)