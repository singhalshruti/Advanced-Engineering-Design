/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rakesh
 */
public class Language {

    public static String backToolTip = "Click here to go back";
    public static String homeToolTip = "Click here to go to the home page";
    public static String settingsToolTip = "Click here to update your settings";
    public static String logoutToolTip = "Click here to logout";
    public static String tipOfTheDayToolTip = "Click here to view tip of the day";
    public static String welcome = "Welcome, ";
    public static String myHome = "My Home";
    public static String manageNetwork = "Mange Network";
    public static String manageEnterprise = "Manage Enterprise";
    public static String manageEnterpriseAdmin = "Manage Enterprise Admin";

    public static String manageTips = "Manage Tips";
    public static String settings = "Settings";
    public static String organization = "Enterprise ";
    public static String enterprise = "Organization ";
    public static String preferedLanguage = "Prefered Language ";
    public static String saveSettings = "Saved successfully.";
    public static String availableNetwork = "Available Networks";
    public static String addNewNetwork = "Add New Network";
    public static String networkName = "Network Name";
    public static String delete = "Delete";
    public static String deleteTT = "Select and entery from the table and click here to delete";
    public static String confirmDelete = "Are you sure wou want to remove the selected entry?";
    public static String successDelete = "Selected entry was successfully deleted.";
    public static String editTT = "Select and entery from the table and click here to edit";
    public static String selectEntry = "Please select an entry.";
    public static String fail = "Unable to perform the requested action. Please contact system administrator.";
    public static String enterpriseName = "Enterprise Name";
    public static String enterpriseType = "Enterprise Type";
    public static String availableEnterprise = "Available Enterprise";
    public static String addNewEnterprise = "Add New Enterprise";
    public static String name = "Name";
    public static String availableEnterpriseAdmin = "Enterprise Admin";
    public static String addNewEnterpriseAdmin = "Add Enterprise Admin";
    public static String manageEnterpriseAdminTT = "Click here to manage enterprise admins";

    public static String firstName = "First Name";
    public static String middleName = "Middle Name";
    public static String lastName = "Last Name";
    public static String gender = "Gender";
    public static String maritalStatus = "Marital Status";
    public static String addreess1 = "Address Line 2";
    public static String address2 = "Address Line 1";
    public static String city = "City";
    public static String state = "State";
    public static String country = "Country";
    public static String zip = "Zip";
    public static String homePhone = "Home Phone";
    public static String cellPhone = "Cell Phone";
    public static String email = "Email";

    public static String emergencyContactInformation = "Emergency Contact Information";
    public static String relationship = "Relationship";
    public static String preferredPharmacy = "Preferred Pharmacy";
    public static String primary = "Primary";
    public static String secondary = "Secondary";

    public static String userName = "User Name";
    public static String password = "Password";
    public static String edit = "Edit";
    public static String save = "Save";
    public static String addAllergy = "Add Allergy";
    public static String allergy = "Allergy";
    public static String description = "Description";
    public static String allergyList = "Allergy List";
    public static String addedOn = "Added On";
    public static String remove = "Remove";
    public static String searchBy = "Search By";

    //public static String drugOrderStatus = "Drug Order Status";
    public static String category = "Category";
    //public static String disease = "Disease";
    public static String observation = "Observation";
    public static String date = "Date";
    public static String comments = "Comments";
    public static String updatedOn = "Updated On";
    public static String requestedBy = "Requested By";
    public static String testCenter = "Test Center";
    public static String addVitalSign = "Add Vital Sign";
    public static String connect = "Connect with other users";
    public static String tip = "Tip of the day";
    public static String role = "Role";
    public static String validDetails = "Please specify valid details.";
    public static String accountDetails = "Please specify valid account details.";
    public static String validDOB = "Please specify valid DOB";
    public static String myAppointments = "My Appointments";
    public static String appointmentTime = "Appointment Time";
    public static String reason = "Reason";
    public static String scheduledBy = "Scheduled By";
    public static String MyProfile = "My Profile";
    public static String flightBooking = "Flight Booking";
    public static String bookedHistory = "Booked History";
    public static String contactUs = "Contact Us";
    public static String addRequest = "Add Request";
    public static String type = "Type";
    public static String myRequests = "My Requests";
    public static String requestId = "Request Id";
    public static String status = "Status";
    public static String myBookings = "My Bookings";
    public static String bookingHistory = "Booking History";
    public static String all = "All";
    public static String upcomingJourneys = "Upcoming Journeys";
    public static String cancelTicket = "Cancel Ticket";
    public static String PNR = "PNR";
    public static String bookingDate = "Booking Date";
    public static String source = "Source";
    public static String destination = "Destination";
    public static String payment = "Payment";
    public static String travelDate = "Travel Date";
    public static String fromDate = "From Date";
    public static String toDate = "To Date";
    public static String search = "Search";
    public static String avaliableFlight = "Avaliable Flights";
    public static String flightId = "Flight ID";
    public static String numberOfTickets = "Number Of Tickets";
    public static String ticketclass = "Class";
    public static String business = "Business";
    public static String economy = "Economy";
    public static String selectFlight = "Select Flight";
    public static String resetSearch = "Reset Search";
    public static String economyFare = "Economy Fare";
    public static String businessFare = "Business Fare";
    public static String ticketDetails = "Ticket Details";
    public static String extraTicketsDetails = "Extra Ticket Details";
    public static String contactNumber = "Contact Number";
    public static String discountCoupon = "Discount Coupon";
    public static String book = "Book";
    public static String customerAccountDetails = "Customer Account Details";
    public static String customerInformation = "Customer Information";

    public void updateLanguageSettings(String language) {

        switch (language) {

            case "Spanish":
                customerInformation = "Información al cliente";
                customerAccountDetails = "Detalles de la cuenta del cliente";
                book = "Libro";
                discountCoupon = "Cupón de descuento";
                contactNumber = "Número de contacto";
                ticketDetails = "Detalles de entradas";
                extraTicketsDetails = "Extra Detalles del billete";
                businessFare = "Fare Negocio";
                economyFare = "Fare Economía";
                resetSearch = "Borrar búsqueda";
                selectFlight = "Elija Vuelo";
                economy = "Economía";
                business = "Negocio";
                ticketclass = "Clase";
                numberOfTickets = "Número de entradas";
                flightId = "Vuelo ID";
                avaliableFlight = "Vuelos Avaliable";
                search = "Buscar";
                toDate = "Hasta la fecha";
                fromDate = "Desde la fecha";
                travelDate = "Fecha de viaje";
                payment = "Pago";
                destination = "Destino";
                source = "Fuente";
                bookingDate = "Fecha para registrarse";
                cancelTicket = "Cancelar Ticket";
                upcomingJourneys = "Próximos Viajes";
                all = "Todas";
                bookingHistory = "Reservas Historia";
                myBookings = "Mis Reservas";
                PNR = "PNR";
                status = "Estado";
                requestId = "Solicitud Id";
                myRequests = "Mis solicitudes";
                type = "Escribe";
                addRequest = "Añadir solicitud";
                contactUs = "Contáctenos";
                flightBooking = "reserva de vuelo";
                bookedHistory = "Historia reservado";
                MyProfile = "Mi perfil";
                validDOB = "Por favor, especifique la fecha de nacimiento válida.";
                accountDetails = "Por favor, especifique los detalles de cuenta válidos.";
                homeToolTip = "Haga clic aquí para ir a la página principal";
                settingsToolTip = "Haga clic aquí para actualizar la configuración";
                logoutToolTip = "Haga clic aquí para cerrar la sesión";
                welcome = "Bienvenido, ";
                settings = "Ajustes";
                preferedLanguage = "Prefered Idioma ";
                save = "Guardar";
                saveSettings = "guardado correctamente.";
                myHome = "Mi Casa";
                validDetails = "Por favor, especifique los detalles válidos.";
                firstName = "Nombre de pila";
                middleName = "segundo nombre";
                lastName = "apellido";
                gender = "género";
                maritalStatus = "Estado civil";
                addreess1 = "dirección línea 1";
                address2 = "dirección línea 2";
                city = "dirección línea 1";
                state = "estado";
                country = "país";
                zip = "Zip";
                homePhone = "Telefono casa";
                cellPhone = "Telefono movil";
                email = "Email";

                emergencyContactInformation = "Contacto de Emergencia";
                relationship = "relación";
                preferredPharmacy = "pahrmacy preferida";
                primary = "primario";
                secondary = "secundario";

                userName = "nombre de usuario";
                password = "contraseña";
                edit = "editar";
                save = "guardar";
                addAllergy = "añadir alergia";
                allergy = "alergia";
                description = "descripción";
                allergyList = "lista alergia";
                addedOn = "añadido en";
                remove = "quitar";
                searchBy = "búsqueda por";

                category = "categoría";

                observation = "observación";
                date = "fecha";

                comments = "comentarios";

                updatedOn = "actualizada el";
                requestedBy = "solicitada por";
                testCenter = "centro de pruebas";
                addVitalSign = "añadir signo vital";

                connect = "Conéctese con otros usuarios";
                tip = "Consejo del día";
                role = "papel";
                validDetails = "Por favor, especifique los detalles válidos.";
                confirmDelete = "Seguro que está quieren eliminar la entrada seleccionada ?";
                successDelete = "Entrada seleccionada se ha eliminado correctamente.";
                selectEntry = "Por favor, seleccione una entrada.";
                fail = "No se puede realizar la acción solicitada.";

                myAppointments = "Mis citas";

                appointmentTime = "Appointment Time";
                reason = "Hora de la cita";
                scheduledBy = "Programado Por";
                break;
            default:
                backToolTip = "Click here to go back";
                homeToolTip = "Click here to go to the home page";
                settingsToolTip = "Click here to update your settings";
                logoutToolTip = "Click here to logout";
                tipOfTheDayToolTip = "Click here to view tip of the day";
                welcome = "Welcome, ";
                myHome = "My Home";
                manageNetwork = "Mange Network";
                manageEnterprise = "Manage Enterprise";
                manageEnterpriseAdmin = "Manage Enterprise Admin";

                manageTips = "Manage Tips";
                settings = "Settings";
                organization = "Enterprise ";
                enterprise = "Organization ";
                preferedLanguage = "Prefered Language ";
                saveSettings = "Saved successfully.";
                availableNetwork = "Available Networks";
                addNewNetwork = "Add New Network";
                networkName = "Network Name";
                delete = "Delete";
                deleteTT = "Select and entery from the table and click here to delete";
                confirmDelete = "Are you sure wou want to remove the selected entry?";
                successDelete = "Selected entry was successfully deleted.";
                editTT = "Select and entery from the table and click here to edit";
                selectEntry = "Please select an entry.";
                fail = "Unable to perform the requested action.";
                enterpriseName = "Enterprise Name";
                enterpriseType = "Enterprise Type";
                availableEnterprise = "Available Enterprise";
                addNewEnterprise = "Add New Enterprise";
                name = "Name";
                availableEnterpriseAdmin = "Enterprise Admin";
                addNewEnterpriseAdmin = "Add Enterprise Admin";
                manageEnterpriseAdminTT = "Click here to manage enterprise admins";

                firstName = "First Name";
                middleName = "Middle Name";
                lastName = "Last Name";
                gender = "Gender";
                maritalStatus = "Marital Status";
                addreess1 = "Address Line 2";
                address2 = "Address Line 1";
                city = "City";
                state = "State";
                country = "Country";
                zip = "Zip";
                homePhone = "Home Phone";
                cellPhone = "Cell Phone";
                email = "Email";

                emergencyContactInformation = "Emergency Contact Information";
                relationship = "Relationship";
                preferredPharmacy = "Preferred Pharmacy";
                primary = "Primary";
                secondary = "Secondary";

                userName = "User Name";
                password = "Password";
                edit = "Edit";
                save = "Save";
                addAllergy = "Add Allergy";
                allergy = "Allergy";
                description = "Description";
                allergyList = "Allergy List";
                addedOn = "Added On";
                remove = "Remove";
                searchBy = "Search By";

                category = "Category";

                observation = "Observation";
                date = "Date";

                comments = "Comments";

                updatedOn = "Updated On";
                requestedBy = "Requested By";
                testCenter = "Test Center";
                addVitalSign = "Add Vital Sign";

                connect = "Connect with other users";
                tip = "Tip of the day";
                role = "Role";
                validDetails = "Please specify valid details.";

                accountDetails = "Please specify valid account details.";
                validDOB = "Please specify valid DOB";
                myAppointments = "My Appointments";

                appointmentTime = "Appointment Time";
                reason = "Reason";
                scheduledBy = "Scheduled By";
                break;
        }

    }
}
