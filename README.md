# alticci-sequence

<h1> Deploy </h1>
<p>Rode o projeto na porta padrão 8080.</p>
<p>Deve ser utilizado com o projeto de front-end presente no repositório alticci-sequence-GUI</p>

<h1> BackLog </h1>

<p>Deverá ser implementado um serviço REST utilizando uma framework JAVA1 que devolve um valor da sequência Alticci.
Opcionalmente poderá ser implementado um GUI web simples em JavaScript2 para consultar o serviço.</p>
<br>
<p>
A sequência Alticci - a(n) - é definida da seguinte forma:
  <ul>
<li>n=0 => a(0) = 0</li>
<li>n=1 => a(1) = 1</li>
<li>n=2 => a(2) = 1</li>
<li>n>2 => a(n) = a(n-3) + a(n-2)</li>
<ul>
</p>  
  <p>
Exemplo dos primeiros valores da sequência:
<ul>  
<li>0 = 0</li>
<li>1 = 1 </li>
<li>2 = 1 </li>
<li>3 = 1 </li>
<li>4 = 2 </li>
<li>5 = 2 </li>
<li>6 = 3 </li>
<li>7 = 4 </li>
<li>8 = 5 </li>
<li>9 = 7 </li>
<li>10 = 9 </li>
  </ul>
  
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
