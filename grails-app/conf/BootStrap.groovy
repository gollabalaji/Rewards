import com.Rewards.auth.*
import rewards.Product

class BootStrap {

    def init = { servletContext ->
        new rewards.Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new rewards.Product(name: "Dark Roast", sku: "DR02", price: 12.95).save()
        new rewards.Customer(phone: 8015551212, firstName: "Luther", lastName: "Allison", totalPoints: 1).save()
        new rewards.Customer(phone: 2135551212, firstName: "Bessie", lastName: "Brown", totalPoints: 2).save()
        new rewards.Customer(phone: 6055551212, firstName: "Bo", lastName: "Diddley", totalPoints: 3).save()
        new rewards.Customer(phone: 6165551212, firstName: "Leroy", lastName: "Foster", totalPoints: 4).save()
        new rewards.Customer(phone: 8015554321, firstName: "Earl", lastName: "Hooker", totalPoints: 5).save()
        new rewards.Customer(phone: 7315551212, firstName: "Maggie", lastName: "Jones", totalPoints: 5).save()
        new rewards.Customer(phone: 8185551212, firstName: "Nick", lastName: "Moss", totalPoints: 4).save()
        new rewards.Customer(phone: 7085551212, firstName: "Odie", lastName: "Payne", totalPoints: 3).save()
        new rewards.Customer(phone: 4155551212, firstName: "Jonny", lastName: "Shines", totalPoints: 2).save()
        new rewards.Customer(phone: 7225551212, firstName: "Ethel", lastName: "Waters", totalPoints: 1).save()
        new rewards.Customer(phone: 6045551212, firstName: "Scrapper", lastName: "Blackwell", totalPoints: 1).save()
        new rewards.Customer(phone: 7315551122, firstName: "Archie", lastName: "Edwards", totalPoints: 2).save()
        new rewards.Customer(phone: 5145551212, firstName: "Jessie", lastName: "Fuller", totalPoints: 3).save()
        new rewards.Customer(phone: 4085551212, firstName: "Ida", lastName: "Goodson", totalPoints: 4).save()
        new rewards.Customer(phone: 8015551234, firstName: "Bumble Bee", lastName: "Smith", totalPoints: 5).save()
        new rewards.Customer(phone: 4315551212, firstName: "Sippie", lastName: "Wallace", totalPoints: 4).save()

        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def user = User.findOrSaveWhere(username: 'bgolla@wustl.edu', password: 'krupalaji', firstName: 'Balaji', lastName: 'Golla', emailAddress: 'bgolla@wustl.edu')

        if(( !user.authorities.contains(adminRole))) {
            UserRole.create(user, adminRole, true)
        }
    }
    def destroy = {
    }
}
