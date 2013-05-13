package discosalvarito

class GeneroMusical {
	String genero
	
    static constraints = {
    }

    static belongsTo = Obra

    static hasMany = [obra:Obra]

    String toString () {
    	"${genero}"
    }
}
