# Pousada (Herança com parâmetro e validação)

## Objetivo
Calcular o preço de uma estadia em três modalidades de acomodação,
validando a quantidade de diárias e somando o total da pousada.

## Hierarquia
Acomodacao → Suite
Acomodacao → Chale

## Regras de cálculo
- Acomodacao: diaria * quantidadeDiarias
- Suite: (diaria + adicionalConforto) * quantidadeDiarias
- Chale: (diaria * quantidadeDiarias) + taxaLimpeza
- Quantidade <= 0: imprimir erro e retornar 0, sem adicionais nem taxas

## Classes
- Acomodacao: identificacao, valorDiaria, getters, calcularEstadia(int diarias)
- Suite: adicionalConforto, getter, calcularEstadia() com @Override
- Chale: taxaLimpeza, getter, calcularEstadia() com @Override
- Pousada: nome, ArrayList<Acomodacao>, adicionarAcomodacao(),
  gerarRelatorio(int diarias), calcularTotal(int diarias)
- App: cria a pousada com as três acomodações e testa os cenários

## Observação importante
Relatório e total usam a mesma operação de cálculo por referência do tipo
Acomodacao. A pousada não decide a fórmula: cada objeto executa a sua.

## Saída esperada (diária R$ 100,00, 2 diárias)
Comum: R$ 200,00
Suíte: R$ 280,00
Chalé: R$ 260,00
Total: R$ 740,00

## Casos de teste adicionais
- Zero diárias → mensagem de erro e valor 0
- Diárias negativas → mensagem de erro e valor 0
- Pousada sem acomodações → mensagem de lista vazia e total 0

## Conceitos aplicados
extends, super, @Override, ArrayList, validação, polimorfismo
