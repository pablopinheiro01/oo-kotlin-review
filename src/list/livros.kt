package list

val listaDeLivros = mutableListOf<Livro>(

    Livro(titulo = "Java com JSF 1.0", autor = "Caelum", anoPublicacao = 2011, editora = "Editora Casa do codigo"),
    Livro(titulo = "Spring Boot", autor = "AlgaWorks", anoPublicacao = 2020, editora = "Editora Alga+"),
    Livro(titulo = "JavaScript Avançado", autor = "Erick Wendel", anoPublicacao = 2021, editora = "Editora B"),
    Livro(titulo = "Boas Praticas de Programação OO", autor = "Pablo", anoPublicacao = 2000, editora = "Editora Tkio"),
    Livro(titulo = "Harry Potter e a Pedra Filosofal", autor = "j.k rowling", anoPublicacao = 1997, editora = "Editora A"),
    Livro(titulo = "Dom Quixote", autor = "Miguel de Cervantes", anoPublicacao = 1874, editora = "Editora b"),
    Livro(titulo = "O Conde de Monte Cristo", autor = "Alexandre Dumas", anoPublicacao = 2011, editora = "Editora c"),
    Livro(titulo = "Um Conto de Duas Cidades", autor = "Charles Dickens", anoPublicacao = 2000, editora = "Editora d"),
    Livro(titulo = "O Pequeno Príncipe", autor = "Antoine de Saint-Exupéry", anoPublicacao = 2000, editora = "Editora e"),
    Livro(titulo = "O Senhor dos Anéis", autor = "J.R.R. Tolkien", anoPublicacao = 2000, editora = "Editora f"),
    Livro(titulo = "Código Limpo: Habilidades Práticas do Agile Software", autor = "Robert C. Martin", anoPublicacao = 2000, editora = "Editora g"),
    Livro(titulo = "Trabalho Eficaz com Código Legado", autor = "Michael C. Feathers", anoPublicacao = 2000, editora = "Editora h"),
    Livro(titulo = "Refatoração: Aperfeiçoando o Design de Códigos Existentes", autor = "Kent Beck", anoPublicacao = 2000, editora = "Editora i"),

)

val listaDeLivrosComNulos = mutableListOf<Livro?>(
    Livro(titulo = "Java com JSF 1.0", autor = "Caelum", anoPublicacao = 2011,),
    Livro(titulo = "Spring Boot", autor = "AlgaWorks", anoPublicacao = 2020, editora = "Editora Alga+"),
    Livro(titulo = "JavaScript Avançado", autor = "Erick Wendel", anoPublicacao = 2021, ),
    null,
    Livro(titulo = "Harry Potter e a Pedra Filosofal", autor = "j.k rowling", anoPublicacao = 1997, editora = "Editora A"),
    null,
    Livro(titulo = "O Conde de Monte Cristo", autor = "Alexandre Dumas", anoPublicacao = 2011, ),
    Livro(titulo = "Um Conto de Duas Cidades", autor = "Charles Dickens", anoPublicacao = 2000, editora = "Editora d"),
    null,
    Livro(titulo = "O Pequeno Príncipe", autor = "Antoine de Saint-Exupéry", anoPublicacao = 2000,),
    Livro(titulo = "O Senhor dos Anéis", autor = "J.R.R. Tolkien", anoPublicacao = 2000, editora = "Editora f"),
    Livro(titulo = "Código Limpo: Habilidades Práticas do Agile Software", autor = "Robert C. Martin", anoPublicacao = 2000),
    Livro(titulo = "Trabalho Eficaz com Código Legado", autor = "Michael C. Feathers", anoPublicacao = 2000, editora = "Editora h"),
    Livro(titulo = "Refatoração: Aperfeiçoando o Design de Códigos Existentes", autor = "Kent Beck", anoPublicacao = 2000, editora = "Editora i"),
    null,
    null,
    null
    )