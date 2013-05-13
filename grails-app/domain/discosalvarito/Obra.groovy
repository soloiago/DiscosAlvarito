package discosalvarito

class Obra {
	String titulo
	Date fechaEstreno
	GeneroMusical generoMusical

	static constraints = {
    }

    static hasMany = [autorMusica:AutorMusica, autorLetra:AutorLetra]
}
