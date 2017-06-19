package rewards

class WhiteboardController {
    def calculationsService

    def index() {}

    def variables() {
        def myTotal = 1
        render("Total:" + myTotal)
        render("</br>" + myTotal.class)
        myTotal = myTotal + 1
        render("</br>New Total: " + myTotal + "</br>")

        def firstName = "Balaji"
        render("</br>Name: " + firstName)
        render("</br>" + firstName.class)
        firstName = firstName + 1
        render("</br>New First Name: " + firstName + "</br>")

        def today = new Date("6/15/17")
        render("</br> Today is: " + today)
        render("</br>" + today.class)
        today = today + 1
        render("</br>New Today: " + today + "</br>")
    }

    def strings() {
        def first = "Balaji"
        def last = "Golla"
        def fullName = "Balaji Golla"
        def points = 4
        render "Your string $fullName has ${fullName.length()} charecters in length."
    }

    def conditions() {
        def welcomeMessage = calculationsService.welcome(params)
        render welcomeMessage
    }


}