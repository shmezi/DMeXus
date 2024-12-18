package lol.ezra.permission

object PermissionManager {
   private val permissions = mutableMapOf<String, Permission>()
   private val userMap = mutableMapOf<User,MutableSet<Permission>>()

}
