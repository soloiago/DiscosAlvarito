package discosalvarito

class AutorLetra {
	String nombre

    static constraints = {
    }

    static belongsTo = Obra

    static hasMany = [obra:Obra]
}
