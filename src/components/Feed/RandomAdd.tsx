import React from 'react'
import UserBar from './UserBar'

const RandomAdd: React.FC = () => {
  return (
	<div className='flex flex-col justify-between bg-[#191819] w-[450px] h-[200px] rounded-xl p-4'>
		<p className='text-[#cac9ca] ml-2 '>Recommendation</p>
		<div className='flex flex-col gap-4 py-2'>
			<UserBar />
			<UserBar />
		</div>
	</div>
  )
}

export default RandomAdd
