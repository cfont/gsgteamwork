import app.Role
import app.Message

class BootStrap {

    def init = { servletContext ->
      def user = new Role(name: 'User').save()
      def admin = new Role(name: 'Administrator').save()
      def brother = new Role(name: 'Brother').save()
      def wife = new Role(name: 'Wife').save()

      new Message(title:'The Knights Who Say Nee',detail:'They are after a shrubbery.').save()
      new Message(title:'The Black Night',detail:'Just a flesh wound.').save()
      new Message(title:'air speed velocity of a swallow',detail:'African or European?').save()

    }
    def destroy = {
    }
}
