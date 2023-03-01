def functions = [
  [name: 's3-creation-lambda', runtime: 'python3.8', handler: 'lambda_function.lambda_handler', role: 'arn:aws:iam::834829128384:role/RoleForLambda'],
  [name: 'lambda-basics', runtime: 'python3.8', handler: 'lambda_function.lambda_handler', role: 'arn:aws:iam::834829128384:role/RoleForLambda']
]
return functions
