import app.Role

class BootStrap {

    def init = { servletContext ->
      def user = new Role(name: 'User').save()
      def admin = new Role(name: 'Administrator').save()
      def brother = new Role(name: 'Brother').save()
      def wife = new Role(name: 'Wife').save()

    }
    def destroy = {
    }
}
