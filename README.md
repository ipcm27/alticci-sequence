# alticci-sequence

<h1> Deploy </h1>
<p>Rode o projeto na porta padrão 8080.</p>

<h1> BackLog </h1>

<p>Deverá ser implementado um serviço REST utilizando uma framework JAVA1 que devolve um valor da sequência Alticci.
Opcionalmente poderá ser implementado um GUI web simples em JavaScript2 para consultar o serviço.</p>
<br>
<p>
A sequência Alticci - a(n) - é definida da seguinte forma:
n=0 => a(0) = 0
n=1 => a(1) = 1
n=2 => a(2) = 1
n>2 => a(n) = a(n-3) + a(n-2)
</p>  
  <p>
Exemplo dos primeiros valores da sequência:
0 = 0
1 = 1 
2 = 1
3 = 1
4 = 2
5 = 2
6 = 3
7 = 4
8 = 5
9 = 7
10 = 9 
  
  </p>
  <p>
O endpoint a criar será da forma <baseurl>/alticci/{n} em que o {n} representa o índice da sequência para o qual pretendemos obter o valor.
O serviço implementado deverá tirar partido de cálculos passados para acelerar cálculos futuros (caching).
Resposta deverá incluir:
• Código fonte
• Documentação das APIs ReST – formato Open API (Swagger)
• Instruções para execução (em containers ou outra)
Caso existam dúvidas em relação a qualquer ponto que possa influenciar a implementação, o candidato deverá tomar decisões e avançar de acordo com os pressupostos assumidos (que devem ser incluídos na resposta ao exercício).

  </p>
