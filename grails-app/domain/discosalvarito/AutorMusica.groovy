package discosalvarito

class AutorMusica {
	String nombre
	Date fechaNacimiento
	Date fechaMuerte

    static constraints = {
    }

    static belongsTo = Obra

    static hasMany = [obra:Obra]
}
