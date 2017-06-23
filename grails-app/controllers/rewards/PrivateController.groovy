package rewards

import grails.plugin.springsecurity.annotation.Secured


class PrivateController {
    @Secured(['ROLE_ADMIN'])
    def index() {
        render "hello from private.index"
    }

    @Secured(['ROLE_SUPERADMIN'])
    def  superAdmin(){
        render "Hello form private.superadmin"
    }

}
